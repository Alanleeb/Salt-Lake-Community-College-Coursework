<?php ?>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="style.css" rel="stylesheet">
    </head>
    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
        <!-- nav-bar start -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#" >Aaron Templeton</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown" id="dropdown1">
                            <a href="#" class="dropdown-toggle" 
                               data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" >Assignments
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" id="dropdown-menu1">
                                <li><a href="">Assignment 1</a></li>
                                <li><a href="">Assignment 2</a></li>
                                <li><a href="">Assignment 3</a></li>
                                <li><a href="">E-Commerce Site</a></li>
                            </ul>
                        <li><a href="mailto:aaron.templeton@live.com">Contact</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- nav-bar end -->
        <br><br>
        <br><br>
        <div class="col-lg-3">
            <img class="img-responsive img-circle" src="images/aaronsuit.jpg" style="width:350px;height: 350px;">
        </div>
        <div class="col-lg-6" style="font-size: 16px;">
            <h3>About Me</h3>
            <p>My name is Aaron Templeton. I was born on October 19, 1992 and I am currently 23 years of age.
                I have lived in Salt Lake City my entire life.
                I am currently studying at Salt Lake Community College and plan on getting a degree
                in Software Engineering. I have always enjoyed working with computers and learning how to 
                program and develop websites and applications.</p>
            <p>I work at Ball Janik, LLP which is a national law firm. Our office specializes
                in Real Estate Law mainly representing Home Owners Associations. I like my job but dont plan
                on going into law.</p>
            <p>My hobbies include hiking, skiing, traveling, and hanging with my family and friends.</p>
            <p>My favorite movie is The Patriot with Mel Gibson and my favorite book has to be
                Harry Potter cause its probably the only one I've read.</p>
        </div>
        <div class="col-lg-3">
            <img class="img-responsive img-rounded" src="images/bluraaron.jpg" style="width: 350px;height: 350px;">
        </div>
        <br><br>
    </body>
</html>