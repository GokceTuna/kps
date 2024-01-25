<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Kişi Listeleme</title>
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
			<table style="width: 80%">
				<tr>
					<td class="anabaslik">Kişi Listesi</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>
						<h:dataTable value="#{kisiListelemeBean.kisiListesi.list}" var="kisi" border="1">
							<h:column>
								<f:facet name="header"><h:outputText value="T.C. Kimlik No" /></f:facet>
								<h:outputText value="#{kisi.tcKimlikNo}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Ad" /></f:facet>
								<h:outputText value="#{kisi.ad}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Soyad" /></f:facet>
								<h:outputText value="#{kisi.soyad}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Anne Ad" /></f:facet>
								<h:outputText value="#{kisi.anneAd}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Baba Ad" /></f:facet>
								<h:outputText value="#{kisi.babaAd}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Doğum Yeri" /></f:facet>
								<h:outputText value="#{kisi.dogumYer}" />
							</h:column>
							<h:column>
								<f:facet name="header"><h:outputText value="Doğum Tarihi" /></f:facet>
								<h:outputText value="#{kisi.dogumTarih}" />
							</h:column>
						</h:dataTable>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">
						<h:commandButton value="Sonraki Sayfa" action="#{kisiListelemeBean.sayfala}"></h:commandButton>
					</td>
				</tr>
				<tr>
					<td style="text-align: center">
						<h:commandLink action="yeni">Yeni Sorgu</h:commandLink> - 
						<h:commandLink action="menu">Menü</h:commandLink>
					</td>
				</tr>
			</table>
			
			<t:saveState value="#{kisiListelemeBean}"></t:saveState>
		</h:form>
	</f:view>
</body>
</html>