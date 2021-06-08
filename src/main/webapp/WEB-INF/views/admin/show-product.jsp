<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
/*  response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Pragma" , "no-cache");
 response.setHeader("Expires" , "0");
 
 
 if (session.getAttribute("admin-username") == null){
  response.sendRedirect(request.getContextPath() + "/admin/login");
 } */
%>
<!-- Start header section -->
<jsp:include page="./header/header.jsp" flush="true" />
<div class="content-wrapper">
	<div class="container-fluid">

		<div class="row mt-3">
			<div class="col-lg-12">
				<button class="add-catalog">
					<a href="${pageContext.request.contextPath}/addProductDetails">Thêm
						sản phẩm</a>
				</button>
			</div>
			<div class="col-lg-12">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Danh sách sản phẩm</h5>

						<div class="table-responsive">
							<table class="table table-striped">
								<thead>
									<tr>

										<th scope="col">ID sản phẩm</th>
										<th scope="col">Tên sản phẩm</th>
										<th scope="col">Hình ảnh</th>
										<th scope="col">Trạng thái</th>
										<th scope="col">Giá sản phẩm</th>
										<th scope="col">Số Lượng</th>
										<th scope="col">Màu</th>
										<th scope="col">chất lượng hiển thị</th>
										<th scope="col">Ram</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${productDetailsList}" var="productDetails">
										<tr>
											<th scope="row">${productDetails.productdetailsId}</th>
											<td>${productDetails.productDetailsName }</td>
											<td>${images.imagesSmall}</td>
											<td>${productDetails.status}</td>
											<td>${productDetails.prince}</td>
											<td>${productDetails.numberProduct }</td>
											<td>${productDetails.color.colorName}</td>
											<td>${productDetails.size.sizeName}</td>
											<td>${productDetails.ram.ram}</td>
											<td>
												<button class="btn btn-danger">
													<a
														href="${pageContext.request.contextPath}/DeleteProductDetails/${productDetails.productdetailsId}">Xóa</a>
												</button>

												<button class="btn btn-success">
													<a
														href="${pageContext.request.contextPath}/editProductDetails/${productDetails.productdetailsId}">Sửa</a>
												</button>
											</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>

					</div>
				</div>
			</div>
		</div>
		<div class="overlay toggle-menu"></div>
	</div>
</div>


<jsp:include page="./footer/footer.jsp" flush="true" />