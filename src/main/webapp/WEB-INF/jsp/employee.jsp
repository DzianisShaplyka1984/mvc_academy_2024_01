<%@ include file="common/header.jsp"%>

                <c:forEach items="${employees}" var="employee">
                    <a href="<c:url value="/employee?id=${employee.id}"/>"> ${employee.name} </a><br>
                </c:forEach>

<%@ include file="common/footer.jsp"%>