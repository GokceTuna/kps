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
		<h1 style="text-align: center">Sorgu Sonucu</h1>
		
		<h:form id="form">
			<div>
				<table style="width: 50%">
					<tr>
						<td colspan="2" class="baslik">Kimlik No:</td>
						<td colspan="2" class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.tcKimlikNo}" /></td>
					</tr>
					<tr>
						<td colspan="4" class="anabaslik">Kişi Bilgileri</td>
					</tr>
					<tr>
						<td class="baslik">Ad</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.ad}" /></td>
						<td class="baslik">Soyad</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.soyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">Anne Ad</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.anneAd}" /></td>
						<td class="baslik">Baba Ad</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.babaAd}" /></td>
					</tr>
					<tr>
						<td class="baslik">Doğum Yeri</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.dogumYer}" /></td>
						<td class="baslik">Doğum Tarihi</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.dogumTarih}" /></td>
					</tr>
					<tr>
						<td class="baslik">Cinsiyet</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.cinsiyet}" /></td>
						<td class="baslik">Medeni Hal</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.medeniHal}" /></td>
					</tr>
					<tr>
						<td class="baslik">Durum</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.durum}" /></td>
						<td class="baslik">Ölüm Tarihi</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.olumTarih}" /></td>
					</tr>
					<tr>
						<td colspan="4" class="anabaslik">Nüfusa Kayıtlı Olduğu Yer Bilgileri</td>
					</tr>
					<tr>
						<td class="baslik">İl</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.kayitYerIl}" /></td>
						<td class="baslik">İlçe</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.kayitYerIlce}" /></td>
					</tr>
					<tr>
						<td class="baslik">Cilt</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.kayitYerCilt}" /></td>
						<td class="baslik">Aile Sıra No</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.aileSiraNo}" /></td>
					</tr>
					<tr>
						<td class="baslik">Birey Sıra No</td>
						<td class="deger"><h:outputText value="#{kisiSorgulamaBean.kisiBilgisi.bireySiraNo}" /></td>
						<td class="baslik"></td>
						<td class="deger"></td>
					</tr>
					<tr>
						<td colspan="4" style="text-align: center">
							<h:commandLink action="yeni">Yeni Sorgu</h:commandLink> - 
							<h:commandLink action="menu">Menü</h:commandLink>
						</td>
					</tr>
				</table>
			</div>
		</h:form>
	</f:view>
</body>
</html>