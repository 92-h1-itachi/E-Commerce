
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Start header section -->
<jsp:include page="./header/header.jsp" flush="true" />



<section id="aa-myaccount">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="aa-myaccount-area">
					<div class="row">

						<div class="col-md-8 col-md-push-2">
							<div class="aa-myaccount-register">
								<h4>Thêm slider</h4>
								<form:form name="form" class="aa-login-form"
									method="post" modelAttribute="" action="" enctype="multipart/form-data">
									<form:hidden path="id" />
									<label for="">Image<span>*</span></label>
									<form:input path="img" type="file" id="img" name="img"
										placeholder="Img" />
									<form:errors path="img" cssStyle="color: #ff0000" />

									<label for="">Name <span>*</span></label>
									<form:input path="name" type="text" id="name" name="name"
										placeholder="Name" />
									<form:errors path="name" cssStyle="color: #ff0000" />

									<label for="">Caption<span>*</span></label>
									<form:input path="caption" type="text" id="caption" name="caption"
										placeholder="Caption" />
									<form:errors path="caption" cssStyle="color: #ff0000" />

									<label for="">Content<span>*</span></label>
									<form:input path="content" type="text" id="content"
										name="content" placeholder="Content" />
									<form:errors path="content" cssStyle="color: #ff0000" />

									<label for="">UrlIMG<span>*</span></label>
									<form:input path="urlIMG" type="text" id="urlIMG"
										name="urlIMG" placeholder="urlIMG" />
									<form:errors path="urlIMG" cssStyle="color: #ff0000" />

									<form:input path="created" type="date" style="display: none"
										id="the-date" name="created" placeholder="Created" />


									<form:button type="submit" class="aa-browse-btn">Thêm slider</form:button>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- / Cart view section -->

<!--  end content-->
<script>
	var date = new Date();

	var day = date.getDate();
	var month = date.getMonth() + 1;
	var year = date.getFullYear();

	if (month < 10)
		month = "0" + month;
	if (day < 10)
		day = "0" + day;

	var today = year + "-" + month + "-" + day;

	document.getElementById('the-date').value = today;
</script>
 <jsp:include page = "./footer/footer.jsp" flush = "true" />