<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Register</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
   <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">ServiceSquare</a>
                  <a class="navbar-brand" href="index.html">Home</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    
                     
                    <li>
                        <a href="#contact"><span class="glyphicon glyphicon-earphone" ></span>1860-123-4569 (Customer support)</a>
                    </li>
                    </ul>
                   
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <br/></br> <br/>
<div class="container-fluid">
    <section class="container">
		<div class="container-page">				
			<div class="col-md-6">
				<h3 class="dark-grey">Registration</h3>
				<form action="">
				<div class="form-group col-lg-12">
					<label>Username</label>
					<input type="" name="" class="form-control" id="" value="">
				</div>
				
				<div class="form-group col-lg-6">
					<label>Password</label>
					<input type="password" name="" class="form-control" id="" value="">
				</div>
				
				<div class="form-group col-lg-6">
					<label>Repeat Password</label>
					<input type="password" name="" class="form-control" id="" value="">
				</div>
								
				<div class="form-group col-lg-6">
					<label>Email Address</label>
					<input type="" name="" class="form-control" id="" value="">
				</div>
				
				<div class="form-group col-lg-6">
					<label>Repeat Email Address</label>
					<input type="" name="" class="form-control" id="" value="">
				</div>			
				
				
				<div class="col-sm-6">	
				<button type="submit" class="btn btn-primary">Register</button>		
				</div>
			
			</div>
				</form>
			
				
				
			
		</div>
	</section>
</div>
<hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; ServiceSquare 2014</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Contact Form JavaScript -->
    <!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

</body>

</html>
