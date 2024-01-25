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
	<h2 style="text-align: center;">Kişi Listeleme</h2>
	<f:view>
		<h:form id="form">
			<div style="text-align: center">
				<h:messages showDetail="true" showSummary="true" errorStyle="color: red; font-weight: normal" fatalStyle="color: red; font-weight: bold"></h:messages>
			</div>
			<table style="width: 60%">
				<tr>
					<td colspan="4" class="anabaslik">Kriterler</td>
				</tr>
				<tr>
					<td colspan="4">&nbsp;</td>
				</tr>
				<tr>
					<td class="baslik">İl</td>
					<td class="deger">
						<h:selectOneMenu value="#{kisiListelemeBean.ilKodu}" valueChangeListener="#{kisiListelemeBean.ilKoduChanged}" onchange="submit();">
							<f:selectItems value="#{kisiListelemeBean.ilListesi}" />
						</h:selectOneMenu>
					</td>
					<td class="baslik">İlce</td>
					<td class="deger">
						<h:selectOneMenu value="#{kisiListelemeBean.ilceKodu}" disabled="#{kisiListelemeBean.ilKoduNotSet}">
							<f:selectItems value="#{kisiListelemeBean.ilceListesi}" />
						</h:selectOneMenu>
					</td>
				</tr>
				<tr>
					<td class="baslik">Başlangıç Tarihi</td>
					<td class="deger">
						<t:inputDate value="#{kisiListelemeBean.baslangicTarih}"></t:inputDate>
					</td>
					<td class="baslik">Bitiş Tarihi</td>
					<td class="deger">
						<t:inputDate value="#{kisiListelemeBean.bitisTarih}"></t:inputDate>
					</td>
				</tr>
				<tr>
					<td class="baslik">Cinsiyet</td>
					<td class="deger">
						<h:selectOneMenu value="#{kisiListelemeBean.cinsiyet}">
							<f:selectItems value="#{kisiListelemeBean.cinsiyetListesi}" />
						</h:selectOneMenu>	
					</td>
					<td class="baslik"></td>
					<td class="deger"></td>
				</tr>
				<tr>
					<td colspan="4" style="text-align: right;">
						<h:commandButton value="Sorgula" action="#{kisiListelemeBean.sorgula}"></h:commandButton>
					</td>
				</tr>
				<tr>
					<td colspan="4" style="text-align: center">
						<h:commandLink action="menu">Menü</h:commandLink>
					</td>
				</tr>
			</table>
			
			<t:saveState value="#{kisiListelemeBean}"></t:saveState>
		</h:form>
	</f:view>
</body>
</html>