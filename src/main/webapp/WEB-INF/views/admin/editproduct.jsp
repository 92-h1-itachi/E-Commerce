<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
  <!-- Start header section -->
  <jsp:include page = "./header/header.jsp" flush = "true" />

    <div class="content-wrapper">
      <div class="container-fluid">
        <div class="row mt-3">
          <div class="col-lg-12">
            <div class="card">
              <div class="card-body">
                <div class="card-title">Sửa sản phẩm</div>
                <hr>
                
                <mvc:form method="post" modelAttribute="productDetais" action="${pageContext.request.contextPath}/updateProductDetails" >

							<div class="form-group">
								<label for="input-1">Mã sản phẩm</label>
								<mvc:input type="text" path="productdetailsId"
									class="form-control" readonly="readonly" id="input-1"
									placeholder="Mã sản phẩm" name="product-sku" />
							</div>

							<div class="form-group">
								<label for="input-1">Loại sản phẩm</label>
								<mvc:select path="product.productId" items="${productList}"
									class="form-control" id="input-1" placeholder="Tên sản phẩm"
									name="product-name" value="${product.name}" />
							</div>


							<div class="form-group">
								<label for="input-2">Tên sản phẩm</label>
								<div>
									<mvc:input path="productDetailsName" class="form-control"
										id="input-1" />
								</div>
							</div>
							<div class="form-group">
								<label for="input-1">Mức giá</label>
								<mvc:input path="prince" class="form-control" id="input-1" />
							</div>
							<div class="form-group">
								<label for="input-1">Số Lượng sản phẩm</label>
								<mvc:input path="numberProduct" type="text" class="form-control"
									id="input-1" />
							</div>
					
					<div class="form-group">
						<label for="input-1">Trạng thái </label>
						<mvc:input path="status" type="text" class="form-control"
							id="input-1" />
					</div>

					<div class="form-group">
						<label for="input-2">Màu sản phẩm</label>
						<div>
							<mvc:select path="color.colorId" required="true"
								items="${colorList}" class="form-control"></mvc:select>
						</div>
					</div>

					<div class="form-group">
						<label for="input-2">Ram</label>
						<div class="input-group">
							<mvc:select path="ram.ramId" items="${ramList}" class="form-control"></mvc:select>


						</div>
					</div>
					<div class="form-group">
						<label for="input-2" class="col-form-label">Kích thước màn
							hình</label>
						<div>
							<mvc:select path="size.sizeId" items="${sizeList}" class="form-control"></mvc:select>
						</div>
					</div>




					<div class="form-footer">
						<button class="btn btn-danger">
							<a href="#">Hủy</a>
						</button>

						<button type="submit" class="btn btn-success">Cập nhật</button>
					</div>
					</mvc:form>
                
               
              </div>
            </div>
          </div>
        </div>
        <div class="overlay toggle-menu"></div>
      </div>
    </div>
  
    <jsp:include page = "./footer/footer.jsp" flush = "true" />