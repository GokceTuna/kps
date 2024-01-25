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
	<f:view>
		<h:form id="form">
			<table style="width: 50%">
				<tr>
					<td colspan="2" class="anabaslik">KPS Erişim Ayarları</td>
				</tr>
				<tr>
					<td class="baslik">KPS Erişim Adresi</td>
					<td class="deger">
						<h:inputText value="#{ayarlarBean.kpsEndpointUri}" style="width:90%"></h:inputText>
					</td>
				</tr>
				<tr>
					<td class="baslik">STS Erişim Adresi</td>
					<td class="deger">
						<h:inputText value="#{ayarlarBean.stsEndpointUri}" style="width:90%"></h:inputText>
					</td>
				</tr>
				<tr>
					<td class="baslik">Kullanıcı Adı</td>
					<td class="deger"><h:inputText value="#{ayarlarBean.username}"></h:inputText></td>
				</tr>
				<tr>
					<td class="baslik">Parola</td>
					<td class="deger"><h:inputSecret value="#{ayarlarBean.password}"></h:inputSecret></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
						<h:commandButton value="Ayarla" action="#{ayarlarBean.ayarla}"></h:commandButton>
					</td>
				</tr>
			</table>
		</h:form>
	</f:view>
</body>
</html>