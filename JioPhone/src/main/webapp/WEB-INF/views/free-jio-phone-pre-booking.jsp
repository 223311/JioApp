<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jio Phone Pre-Booking Rs.1500 Jio Phone Registration</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0"/>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" >

<link rel='stylesheet prefetch' href='//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
<link rel='stylesheet prefetch'	href='//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css'>
<link rel='stylesheet prefetch'	href='//cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.0/css/bootstrapValidator.min.css'>
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Cinzel" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Nunito+Sans" rel="stylesheet">
<link href=" https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.1.1/min/dropzone.min.css" rel="stylesheet">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="resources/js/jqery.js"></script>
<!-- <script src="resources/js/jquery_d.js"></script>
 -->
</head>
<body>
	<div class="col-md-6 col-md-offset-3">
<div class="panel">
    <div class="panel-body">
       
        <div class="profile-layout">
            
            <div class="profile-section">
                
                    <div class="profile-img-section">
                        <img src="resources/jio-free-phone-booking.jpg" class="img-responsive profile-img">
                    </div>
                    <div class="text-information">
                        <h2 class="main-name">Jio Phone Pre-Booking</h2>
                    </div>
                    <div class="tab-section">
                        <ul class="nav nav-tabs">
                          <li class="active"><a data-toggle="tab" href="#home" ><i class="fa fa-info-circle fa-lg"></i></a></li>
                          <li><a data-toggle="tab" href="#menu1"><i class="fa fa-users fa-lg"></i></a></li>
                          <li><a data-toggle="tab" href="#menu2"><i class="fa fa-key fa-lg"></i></a></li>
                        </ul>
    
                        <div class="tab-content">
                          <div id="home" class="tab-pane fade in active">
                           
                            <div class="info-section">
                             
                                <spring:form action="">
                                  <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-id-card fa-lg"></i></span>
                                        <input id="" type="text" class="form-control" name="name" placeholder="Full Name" value="Full Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-mobile fa-lg"></i></span>
                                        <input type="text" class="form-control" name="" placeholder="Mobile" value="9876543210">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-envelope-open fa-lg"></i></span>
                                        <input  type="text" class="form-control"  placeholder="Email" value="yourname@gmail.com">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-map-marker fa-lg"></i></span>
                                        <input id="" type="text" class="form-control" name="address" placeholder="Address" value="h, Sec 33">
                                    </div>
                                </div>
                                    <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-map-marker fa-lg"></i></span>
                                        <input id="" type="text" class="form-control" name="city" placeholder="City" value="Noida">
                                    </div>
                                </div>
                              <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-map-marker fa-lg"></i></span>
                                        <input id="" type="text" class="form-control" name="pin" placeholder="Pin Code" value="400032">
                                    </div>
                                </div>
                                <div class="text-right">
                                   <input type="submit" class="btn-primary btn btn-submit" value="Submit">
                                </div>
                                </spring:form>
                            </div>
                          </div>
                          <div id="menu1" class="tab-pane fade">
                          <p>Tell 10 friends on WhatsApp about the Jio Phone Booking!</p>
                          <p>1. Click 10x on the WhatsApp button (don't forget to press the 'back/home' button to continue!)!</p>
							<p>2. Click "Book Now" to Subscribe</p>
                                <div class="whatsapp"><a class="fa fa-whatsapp" onclick="fn1(this); goNow();" target="_blank"></a></div>
                            <a onclick="fn2(this); goNow();" class="btn-primary btn btn-submit">Book Now</a>
                        
                          </div>
                          <div id="menu2" class="tab-pane fade">
                     
                          </div>
                    </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.1.1/min/dropzone.min.js"></script>
</body>
</html>