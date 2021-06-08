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
                <div class="card-title">Thêm sản phẩm</div>
                <hr>
                
                
						<mvc:form modelAttribute="productDetails" method="post"
							action="${pageContext.request.contextPath}/saveNewProductDetails" enctype="multipart/form-data">


							<div class="form-group">
								<label for="input-1">Loại sản phẩm</label>
								<div>
									<mvc:select path="product.productId" items="${productList}"  class="form-control"></mvc:select>
								</div>
							</div>

							<div class="form-group">
								<label for="input-2">Tên Sản phẩm</label>
								<mvc:input path="productDetailsName" required="true" class="form-control" />
							</div>

							<div class="form-group">
								<label for="input-1">Mức giá</label>
								<mvc:input path="prince" class="form-control" />
							</div>
							
							<div class="form-group">
								<label for="input-2">Số lượng Sản phẩm</label>
								<mvc:input path="numberProduct" required="true" class="form-control" />
							</div>
							
							<div class="form-group">
								<label for="input-2">Trạng thái</label>
								<mvc:input path="status" required="true" class="form-control" />
							</div>

							<div class="form-group">
								<label for="input-2">Màu sản phẩm</label>
								<div>
									<mvc:select path="color.colorId" required="true" items="${colorList}"  class="form-control"></mvc:select>
								</div>
							</div>

							<div class="form-group">
								<label for="input-2">Ram</label>
								<div class="input-group">
									<mvc:select path="ram.ramId" items="${ramList}"  class="form-control"></mvc:select>
								</div>
							</div>
							<div class="form-group">
								<label for="input-2" class="col-form-label">Kích thước màn hình</label>
								<div>
									<mvc:select path="size.sizeId" items="${sizeList}"  class="form-control"></mvc:select>
								</div>
							</div>


							<div class="form-group">
								<label for="input-1">Ảnh sản phẩm</label> 
								<input type="file" class="form-control"  name="file">
							</div>
							
							<div class="form-footer">
								<button class="btn btn-danger">
									<i class="fa fa-times"></i><a href="#">Hủy</a>
								</button>
								<button type="submit" class="btn btn-success">
									<i class="fa fa-check-square-o"></i> Thêm
								</button>
							</div>
						</mvc:form>
               
              </div>
            </div>
          </div>
        </div>
        <div class="overlay toggle-menu"></div>
      </div>
    </div>
<script>
		var date = new Date();
		
		var day = date.getDate();
		var month = date.getMonth() + 1;
		var year = date.getFullYear();
		
		if (month < 10) month = "0" + month;
		if (day < 10) day = "0" + day;
		
		var today = year + "-" + month + "-" + day;
		
		
		document.getElementById('the-date').value = today;
</script>
    <jsp:include page = "./footer/footer.jsp" flush = "true" />