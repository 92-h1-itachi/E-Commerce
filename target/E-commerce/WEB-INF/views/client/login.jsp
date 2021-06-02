<%-- 
    Document   : index
    Created on : May 5, 2020, 10:57:00 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/resources/client/assets" var="url" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Start header section -->
<jsp:include page="./header/mainHeader.jsp" flush="true" />
<!-- / header section -->
<!--  content -->
<!-- catg header banner section -->
<section id="aa-catg-head-banner">
	<img src="${url}/images/archive-banner.png" alt="banner blog">
	<%--   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Đăng nhập</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>                   
          <li style="color:#fff">Đăng nhập</li>
        </ol>
      </div>
     </div>
   </div> --%>
</section>
<!-- / catg header banner section -->

<!-- Cart view section -->
<section id="aa-myaccount">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="aa-myaccount-area">
					<div class="row">
						<div class="col-md-8 col-md-push-2">
							<div class="aa-myaccount-login">
								<h4>Đăng nhập</h4>
								<form:form class="aa-login-form" name="loginform"
									onsubmit="validate();" action="login" modelAttribute="user"
									method="post">
									<form:hidden path="id" />
									<label for="">Username<span>*</span></label>
									<form:input path="username" type="text"  id="username" name="username"  placeholder="Username"/>
                                    <form:errors path="username" cssStyle="color: #ff0000"/>
								
									<label for="">Mật khẩu<span>*</span></label>
									<form:input path="password" type="password"  id="password"  name="password" placeholder="Password"/>
                                    <form:errors path="password" cssStyle="color: #ff0000"/>
									
									<p class="rememberme" style="display: block">
										<form:input path="rememberme" type="checkbox" id="rememberme"/> Ghi nhớ
									</p>

									<p style="color: red; display: block">${errorMsg}</p>
									<form:button type="submit" class="aa-browse-btn">Đăng nhập</form:button>

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
<!--  footer-->
<jsp:include page="./footer/footer.jsp" flush="true" />
<!-- end footer-->


