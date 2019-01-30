<?php ?>
<html>
    <head>
        <title>Who Am I</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="../bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="../style.css" rel="stylesheet">
    </head>
    <body>
        <h2 class="text-center">Who Am I?</h2>
        <p class="text-center">Please enter your information</p>
        <br><br>
        <form method="post" action="WhoYouAre.php">
            <div class="container text-center" style="max-width: 30%;">
                <div class="form-group">
                    <input type="text" class="form-control" name="Name" placeholder="Name" required>
                </div>
                <div class="form-group">
                    <input type="number" class="form-control" name="Age" placeholder="Age" required>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="Address" placeholder="Address" required>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="State" placeholder="State" required>
                </div>
                <div class="form-group" style="font-size: 16px; text-align: left;">
                    <input type="radio"  name="Gender" value="Male" checked>&nbsp; Male
                    <br>
                    <input type="radio"  name="Gender" value="Female">&nbsp; Female
                </div>
                <br>
                 <div class="form-group">
                    <input type="submit" class="btn btn-primary">
                </div>
            </div>
        </form>
    </body>
</html>

