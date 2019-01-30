function toggle() {
    var x = document.getElementById("deliveryForms");
    if (!x.style.visibility || x.style.visibility === "hidden") {
        x.style.visibility = "visible";

    } else {
        x.style.visibility = "hidden";
    }

}
function toggletwo() {
    var y = document.getElementById("pickuptime");
    if (!y.style.display || y.style.display === "none") {
        y.style.display = "block";
    } else {
        y.style.display = "none";
    } 
    
    var a = document.getElementById("time");
    var d = new Date();
    var x =(d.getMinutes() + 25);
    var y = d.getHours();
    if (x>=60) {
        x=x-60;
        y=y+1;
    }
    if(y<11 || y>21){
       a.innerHTML = "we are closed. You may place online order between 11am - 9pm.";
    }
    var ampm;
    if (y>=12) {
        ampm = "PM";
    } else {
        ampm = "AM";
    }
    if (y === 13) {
        y = 1;
        ampm = "PM";
    }
    if (y === 14) {
        y = 2;
        ampm = "PM";
    }
    if (y === 15) {
        y = 3;
        ampm = "PM";
    }
    if (y === 16) {
        y = 4;
        ampm = "PM";
    }
    if (y === 17) {
        y = 5;
        ampm = "PM";
    }
    if (y === 18) {
        y = 6;
        ampm = "PM";
    }
    if (y === 19) {
        y = 7;
        ampm = "PM";
    }
    if (y === 20) {
        y = 8;
        ampm = "PM";
    }
    if (y === 21) {
        y = 9;
        ampm = "PM";
    }
    if (y === 22) {
        y = 10;
        ampm = "PM";
    }
    if (y === 23) {
        y = 11;
        ampm = "PM";
    }
    if (y === 24) {
        y = 12;
        ampm = "AM";
    }
    
    
    x = x<10?"0"+x:x;
    a.innerHTML = y + ":"  + x + " " +ampm;
}
