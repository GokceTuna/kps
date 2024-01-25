<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Kişi Sorgulama</title>
<style type="text/css">
	.anabaslik {
		text-align: center;
		font-weight: bold;
		font-size: large;
		border-bottom: medium;
		border-bottom-color: black;
		border-bottom-style: solid;
		border-bottom-width: 2px;
		padding-top: 5px;
	}

	.baslik {
		text-align: right;
		font-style: normal;
		font-weight: bold;
		padding-right: 5px;
	}
	
	.deger {
		text-align: left;
		padding-left: 5px;
	}

	table {
		margin-left: auto;
		margin-right: auto; 
	}
</style>
</head>
<body>
	<h2 style="text-align: center;">Sorgu Sonucu</h2>
	<f:view>
		<h:form id="form">
			<div style="text-align: center">
				<h:messages showDetail="true" showSummary="true" errorStyle="color: red; font-weight: normal" fatalStyle="color: red; font-weight: bold"></h:messages>
			</div>
			<table style="width: 50%">
				<tr>
					<td class="anabaslik">İller</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>
						<h:dataTable value="#{ilListelemeBean.ilListesi}" var="il" border="1">
							<h:column>
								<f:facet name="header"><h:outputText value="Kod" /></f:facet>
								<h:outputText value="#{il.kod}"></h:outputText>
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Ad" /></f:facet>
								<h:outputText value="#{il.ad}"></h:outputText>
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Komut" /></f:facet>
								<h:commandLink action="ilceListesi" value="İlçeleri Göster" >
									<f:param name="ilKodu" value="#{il.kod}" />
									<f:param name="ilAdi" value="#{il.ad}" />
								</h:commandLink>
							</h:column>
						</h:dataTable>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center">
						<h:commandLink action="menu">Menü</h:commandLink>
					</td>
				</tr>
			</table>
			
		</h:form>
	</f:view>
</body>
</html>