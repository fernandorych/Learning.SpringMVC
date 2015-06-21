<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8" />
<title>Login</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/animate.min.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/fonts/font-awesome.min.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/simple-line-icons.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/fonts/font.css"
	type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/app.min.css"
	type="text/css" />

<script
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
 
</head>
<body>
	<div class="app app-header-fixed  ">


		<div class="container w-xxl w-auto-xs">
			<a href class="navbar-brand block m-t">CallSytem</a>
			<div class="m-b-lg">
				<div class="wrapper text-center">
					<strong>Logar-se para continuar</strong>
				</div>
				<form name="form" action="/callsystem/login" class="form-validation"
					method="POST">
					<div class="text-danger wrapper text-center" ng-show="authError">

					</div>
					<div class="list-group list-group-sm">
						<div class="list-group-item">
							<input type="email" placeholder="Email" name="Email" id="Email"
								class="form-control no-border" ng-model="user.email" required value="erick.workspace@gmail.com">
						</div>
						<div class="list-group-item">
							<input type="password" name="Senha" id="Senha"
								placeholder="Password" class="form-control no-border"
								value="123" required>
						</div>
					</div>
					<button type="submit" onlick="login()"
						class="btn btn-lg btn-success btn-block" id="btn-login"
						ng-disabled='form.$invalid'>Entrar</button>

					<div class="line line-dashed"></div>
<button type="submit" 
						class="btn btn-lg btn-info btn-block" id="btn-loginDirect"
						>Entrar diretamente</button>
				</form>
			</div>

		</div>


	</div>


	<jsp:include page="/WEB-INF/views/shared/footer.jsp"></jsp:include>