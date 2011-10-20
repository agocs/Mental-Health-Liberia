
<%@ page import="edu.gatech.mentalhealthliberia.PatientEncounterForm" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'patientEncounterForm.label', default: 'PatientEncounterForm')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'patientEncounterForm.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="age" title="${message(code: 'patientEncounterForm.age.label', default: 'Age')}" />
                        
                            <g:sortableColumn property="amitriptyline" title="${message(code: 'patientEncounterForm.amitriptyline.label', default: 'Amitriptyline')}" />
                        
                            <g:sortableColumn property="anxietyDisorder" title="${message(code: 'patientEncounterForm.anxietyDisorder.label', default: 'Anxiety Disorder')}" />
                        
                            <g:sortableColumn property="cage" title="${message(code: 'patientEncounterForm.cage.label', default: 'Cage')}" />
                        
                            <g:sortableColumn property="carbamazepine" title="${message(code: 'patientEncounterForm.carbamazepine.label', default: 'Carbamazepine')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${patientEncounterFormInstanceList}" status="i" var="patientEncounterFormInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${patientEncounterFormInstance.id}">${fieldValue(bean: patientEncounterFormInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: patientEncounterFormInstance, field: "age")}</td>
                        
                            <td><g:formatBoolean boolean="${patientEncounterFormInstance.amitriptyline}" /></td>
                        
                            <td>${fieldValue(bean: patientEncounterFormInstance, field: "anxietyDisorder")}</td>
                        
                            <td>${fieldValue(bean: patientEncounterFormInstance, field: "cage")}</td>
                        
                            <td><g:formatBoolean boolean="${patientEncounterFormInstance.carbamazepine}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${patientEncounterFormInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
