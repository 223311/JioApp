<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://www.springframework.org/tags/form" prefix="spring"%>
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
								<li class="active"><a data-toggle="tab" href="#home"> <i
										class="fa fa-info-circle fa-lg"></i>
								</a></li>
								<li><h4> Jio Phone Booking Form</h4></li>
							</ul>
							<div class="tab-content">
								<div id="home" class="tab-pane fade in active">
									<div class="info-section">
									
										<spring:form action="free-jio-phone-pre-booking"
											commandName="booking">
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-id-card fa-lg"></i>
													</span>
													<spring:input id="" type="text" class="form-control"
														path="fullName" placeholder="Full Name" />
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-mobile fa-lg"></i>
													</span>
													<spring:input type="text" class="form-control"
														path="mobileNo" placeholder="Mobile" />
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-envelope-open fa-lg"></i>
													</span>
													<spring:input type="text" class="form-control" path="email"
														placeholder="Email" />
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-map-marker fa-lg"></i>
													</span>
													<spring:input id="" type="text" class="form-control"
														path="address" placeholder="Address"  />
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-map-marker fa-lg"></i>
													</span>
													<spring:input id="" type="text" class="form-control"
														path="city" placeholder="City" />
												</div>
											</div>
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon"> <i
														class="fa fa-map-marker fa-lg"></i>
													</span>
													<spring:input id="" type="text" class="form-control"
														path="pincode" placeholder="Pin Code" />
												</div>
											</div>
											<div class="text-right">
												<input type="submit" class="btn-primary btn btn-submit"
													value="Submit">
											</div>
										</spring:form>
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