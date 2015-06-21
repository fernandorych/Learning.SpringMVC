<jsp:include page="/WEB-INF/views/shared/menu.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!-- content -->

<script>
function cadastrarRamal(id){
	localStorage['id'] =id;
	location.href = "/callsystem/cadastrarRamal";
}

</script>
<div id="content" class="app-content" role="main">
	<div class="app-content-body ">


		<div class="bg-light lter b-b wrapper-md">
			<h1 class="m-n font-thin h3">Usu�rios</h1>
		</div>
		<div class="wrapper-md">
			<div class="panel panel-default">
				<div class="panel-heading">Usu�rios cadastrados no sistema</div>
				<div class="panel-body b-b b-light">
					Search: <input id="filter" type="text"
						class="form-control input-sm w-sm inline m-r" />
				</div>
				<div>
					<table class="table m-b-none" ui-jq="footable"
						data-filter="#filter" data-page-size="5">
						<thead>
							<tr>
								<th data-toggle="true">Codigo</th>
								<th data-toggle="true">Nome</th>
								<th>Email</th> 
								<th>Ramal</th>
								<th data-hide="phone">Op��es</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${not empty ramais}">
								<c:forEach items="${ramais}" var="ramail">
									<tr>
									<td><c:out value="${ramail.getPessoa().getId()}" /></td>
										<td><c:out value="${ramail.getPessoa().getNome()}" /></td>
										<td><a href><c:out
													value="${ramail.getPessoa().getEmail()}" /></a></td>
										 
										<td><c:out value="${ramail.getNumero()}" /></td>
										<td data-value="1">
												<button class="btn btn-success"
												onclick="cadastrarRamal(${ramail.getPessoa().getId()})">+Ramal</button>
											<button class="btn btn-danger"
												onclick="deletar(${ramail.getId()})">-Ramal</button>
										</td> 
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
						<tfoot class="hide-if-no-paging">
							<tr>
								<td colspan="5" class="text-center">
									<ul class="pagination"></ul>
								</td>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>


	</div>
</div>
<!-- / content -->
<script>
function cadastrar(id){
	return location.href='${pageContext.request.contextPath}/cadastrarRamal/'+id
}

function deletar(id){
	
		return location.href='${pageContext.request.contextPath}/deletarRamal/'+id;
	
	
}

</script>
<jsp:include page="/WEB-INF/views/shared/footer.jsp"></jsp:include>