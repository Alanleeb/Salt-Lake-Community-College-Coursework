var x = 0;
var guessCount = 0;
var message = "Hello";
var name = prompt("Enter your name: ", "Name");
document.write("<h2>" + message + " " + name + ", ready to play?</h2>");
var values = new Array();



function initialize() {
    number = Math.random();
    number = number * 100;
    number = Math.floor(number);
}
function checkGuess() {

    setInterval("changePicture()", 3050);
    guessCount++;
    var userGuess = eval(document.guessForm.userGuess.value);
    document.getElementById('guessNumber').innerHTML = guessCount;


    if (number === userGuess) {
        document.getElementById('picture').src = 'check.png';
        document.getElementById('picText').innerHTML = ("Correct!");
        var r = document.getElementById('finishBox');
        x = 2;
        if (!r.style.visibility || r.style.visibility === "hidden") {
            r.style.visibility = 'visible';
        }

    }
    else if (number < userGuess) {
        document.getElementById('picture').src = 'high.png';
        document.getElementById('picText').innerHTML = ("Too High...");
        x = 1;
        values.push(userGuess + ". . .Too High");
        document.getElementById('guessRecord').innerHTML = values.join("<br>");
    }
    else {
        document.getElementById('picture').src = 'low.png';
        document.getElementById('picText').innerHTML = ("Too Low...");
        x = 1;
        values.push(userGuess + ". . .Too Low");
        document.getElementById('guessRecord').innerHTML = values.join("<br>");
    }
    var scrollDiv = document.getElementById("guessRecord");
    scrollDiv.scrollTop = '1500';
}

function changePicture() {
    if (x === 1) {
        document.getElementById('picture').src = 'riddle.png';
        document.getElementById('picText').innerHTML = "Guess Again...";

    }
}

function reload() {
    location.reload();
}






