<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="container-wrapper">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h1>Product Detail</h1>
				<p class="lead">Here is the detail information of the product!</p>
				<c:set var="imageFilename"
					value="/resources/images/${product.name}.jpg" />
				<img src="<c:url value="${imageFilename}" />" alt="image"
					style="width: 80%" />
			</div>

			<div class="col-md-6">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p><b>Manufacturer</b>: ${product.manufacturer}</p>
				<p><b>Category</b>: ${product.category}</p>
				<p><b>${product.price}원</b></p>
			</div>
		</div>
	</div>
</div>

