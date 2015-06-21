<jsp:include page="/WEB-INF/views/shared/menu.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!-- content -->


<div id="content" class="app-content" role="main">
	<div class="app-content-body ">


		<div class="bg-light lter b-b wrapper-md">
			<h1 class="m-n font-thin h3">Ramais</h1>
		</div>
		<div class="wrapper-md">
			<div class="panel panel-default">
				<div class="panel-heading">Ramais cadastrados no sistema</div>
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
								
								<th data-hide="phone,tablet">Ramal</th>
							 
							</tr>
						</thead>
						<tbody>
							<c:if test="${not empty ramais}">
								<c:forEach items="${ramais}" var="ramail">
									<tr>
										 
										<td><c:out value="${ramail.getId()}" /></td>
										<td><c:out value="${ramail.getNumero()}" /></td>
										 
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
 
<jsp:include page="/WEB-INF/views/shared/footer.jsp"></jsp:include>