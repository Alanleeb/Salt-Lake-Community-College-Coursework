<?php
//parameterize variables
$name = htmlentities($_POST['Name']);
$age = $_POST['Age'];
$address = $_POST['Address'];
$state = $_POST['State'];
$gender = $_POST['Gender'];

//get contents from file
$file = explode("\n", file_get_contents("PostPage.txt"));

//get years user has lived
$currentYear = date(Y);
$yearBorn = $currentYear - $age - 1;
$yearsLived = array();

while ($yearBorn != $currentYear) {
    $yearsLived[] = $yearBorn;
    $yearBorn++;
}
//insert current year into array
$yearsLived[] = $currentYear;



//change background for gender
if ($gender == "Male") {
    $background = "#99ccff";
} else {
    $background = "#ff99cc";
}
?>

<html>
    <head>
        <title>Who You Are</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="../bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="../style.css" rel="stylesheet">
    </head>
    <?php
    //print everything into page

    printf("<body style='background-color: %s;'>", $background);
    printf("<h2 class='text-center'>Who You Are</h2>");
      printf ("<div class='container' style='font-size:16px;'>");
        printf(" <p>Your Name is: <b>%s</b></p>", $name);
         printf("<p>Your Age: <b>%d</b></p>", $age);
         printf("<p>Your Address: <b>%s</b></p>", $address);
         printf("<p>Your State: <b>%s</b></p>", $state);
        printf(" <p>Your Gender: <b>%s</b></p>", $gender);
      echo( "</div>");

    ?>
    <br>
    <div class="container">
        <h5>Years you have lived</h5>
        <?php
        //print years lived
            echo implode(", ", $yearsLived);
        ?>
    </div>
    <br>
    <div class='container'>
        <?php
        //print file contents
        echo implode("\n", $file);
        ?>
    </div>
</body>        
</html>
