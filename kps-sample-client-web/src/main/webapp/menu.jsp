<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Kimlik Paylaşımı Sistemi</title>
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

	.ornek {
		text-align: center;
		font-style: normal;
		font-weight: normal;
		padding-right: 5px;
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
					<td class="anabaslik">JAX-WS KPS Örnekleri</td>
				</tr>
                                <tr>
					<td class="ornek">
						<h:commandLink action="bilesikKutukSorgula">Kimlik Numarası ile Bileşik Kütük Sorgulama</h:commandLink>
					</td>
				</tr>
				<tr>
					<td class="ornek">
						<h:commandLink action="kisiSorgula">T.C. Kimlik No ile Kişi Bilgileri Sorgulama</h:commandLink>
					</td>
				</tr>
				<tr>
					<td class="ornek">
						<h:commandLink action="kisiListele">Kişi Listele</h:commandLink>
					</td>
				</tr>
				<tr>
					<td class="ornek">
						<h:commandLink action="ilListesi">İl Listesi</h:commandLink>
					</td>
				</tr>
				<tr>
					<td class="ornek">
						<h:commandLink action="ayarlar">Erişim Ayarları</h:commandLink>
					</td>
				</tr>
			</table>
		</h:form>
	</f:view>
</body>
</html>