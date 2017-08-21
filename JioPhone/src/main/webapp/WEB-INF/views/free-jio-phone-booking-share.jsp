<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<jsp:include page="includes/header.jsp"></jsp:include>
<div class="col-md-6 col-md-offset-3">
	<div class="panel">
		<div class="panel-body">

			<div class="profile-layout">

				<div class="profile-section">

					<div class="profile-img-section">
						<img src="resources/jio-free-phone-booking.jpg"
							class="img-responsive profile-img">
					</div>
					<div class="text-information">
						<h2 class="main-name">Jio Phone Pre-Booking</h2>
					</div>
					<div class="tab-section">
						<ul class="nav nav-tabs">
							<li class="active"><a data-toggle="tab" href=""><i
									class="fa fa-users fa-lg"></i></a></li>
						</ul>

						<div class="tab-content">
							<div id="menu1" class="tab-pane fade in active">

								<div class="info-section">
									<p>Tell 10 friends on WhatsApp about the Jio Phone Booking!</p>
									<p>1. Click 10x on the WhatsApp button (don't forget to
										press the 'back/home' button to continue!)!</p>
									<p>2. Click "Book Now" to Subscribe</p>
									<div class="whatsapp">
										<a class="fa fa-whatsapp" onclick="fn1(this); goNow();"
											target="_blank"></a>
									</div>
									<a onclick="fn2(this); goNow();"
										class="btn-primary btn btn-submit">Book Now</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.1.1/min/dropzone.min.js"></script>
</body>
</html>