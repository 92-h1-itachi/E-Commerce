<%-- 
    Document   : menu
    Created on : May 5, 2020, 11:15:00 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<c:url value="/resources/client/assets" var="url" />
<section id="menu">
	<div class="container">
		<div class="menu-area">
			<!-- Navbar -->
			<div class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="navbar-collapse collapse">
					<!-- Left nav -->
					<ul class="nav navbar-nav">
						<li><a href="<c:url value="/" />">TRANG CHỦ</a></li>
						<li><a href="<c:url value="/introduce" />">GIỚI THIỆU</a></li>
						<li><a href="<c:url value="/product" />">SẢN PHẨM</a>
							<%-- <ul class="dropdown-menu">
								<li><a href="<c:url value="product.jsp" />">Iphone</a></li>
								<li><a href="<c:url value="product.jsp" />">SamSung</a></li>
								<li><a href="<c:url value="product.jsp" />">Nokia</a></li>
								<li><a href="<c:url value="product.jsp" />">MẬT ONG</a></li>
							</ul> --%>
						</li>
						<li><a href="<c:url value="/" />">TIN TỨC</a></li>
						<li><a href="<c:url value="/security" />">CHÍNH SÁCH</a></li>
						<li><a href="<c:url value="/contact" />">LIÊN HỆ</a></li>
						<li class="aa-search">
							<!-- search box --> <a class="aa-search-box">
							 <%-- <form:form action="/search" method="GET">
								<form:hidden path="productdetailsId" />
									<form:input path="keyword" type="text" name="keyword" id="keyword"
										placeholder="Tìm kiếm sản phẩm.." required/>
									<form:button class="serach-box">
										<span class="fa fa-search"></span>
									</form:button>
									<!-- &nbsp;
									<input type="submit" value="Search">
									&nbsp;
									<input type="button" value="Clear"> -->
								</form:form> --%> 
								<mvc:form action="${pageContext.request.contextPath}/search" method="get" >
									<input  name="searchText" type="text"
										value="${searchText}" placeholder="Search" />
									<input class="btn btn-outline-secondary  ml-3 my-sm-0"
										type="submit" value="Searchs">
								</mvc:form>


						</a> <!-- / search box -->
						</li>
					</ul>
				</div>
				<!--/.nav-collapse -->

			</div>
		</div>
	</div>
</section>
