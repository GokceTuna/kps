<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Bileşik Kütük Sorgulama</title>
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
                                                <td colspan="2" class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.kimlikNo }" /></td>
					</tr>
					<tr>
						<td colspan="4" class="anabaslik">T.C. Vatandaşı Kişi Bilgileri</td>
					</tr>
					<tr>
                                                
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.ad}" /></td>
						<td class="baslik">Soyad</td>
						<td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.soyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">T.C. Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.tcKimlikNo}" /></td>
						<td class="baslik">Doğum Tarihi</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.dogumTarih}" /></td>
					</tr>
                                        <tr>
						<td colspan="4" class="anabaslik">Nüfus Cüzdanı Bilgileri</td>
					</tr>
					<tr>
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.cuzdanAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.cuzdanSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">T.C. Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.cuzdanTcKimlikNo}" /></td>
						<td class="baslik">Seri No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.seri}" /><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.no}" /></td>
					</tr>
                                        <tr>
						<td colspan="4" class="anabaslik">TCKK Bilgileri</td>
					</tr>
                                        <tr>
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.tckkAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.tckkSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">T.C. Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.tckkTcKimlikNo}" /></td>
						<td class="baslik">Seri No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.tckkSeriNo}" /></td>
					</tr>
                                        <tr>
						<td colspan="4" class="anabaslik">Geçici Kimlik Bilgileri</td>
					</tr>
                                        <tr>
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.geciciKimlikAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.geciciKimlikSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">T.C. Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.geciciKimlikTcKimlikNo}" /></td>
                                        </tr>
                                        
                                        
                                        <tr>
						<td colspan="4" class="anabaslik">Mavi Kartlı Kişi Bilgileri</td>
					</tr>
					<tr>
                                                
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartliAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartliSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartliKimlikNo}" /></td>
						<td class="baslik">Doğum Tarihi</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartliDogumTarih}" /></td>
					</tr>
                                        <tr>
						<td colspan="4" class="anabaslik">Mavi Kart Bilgileri</td>
					</tr>
					<tr>
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">T.C. Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartKimlikNo}" /></td>
						<td class="baslik">Seri No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartSeri}" /><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.maviKartNo}" /></td>
					</tr>
                                        <tr>
						<td colspan="4" class="anabaslik">Yabancı Kişi Bilgileri</td>
					</tr>
					<tr>
                                                
						<td class="baslik">Ad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.ybAd}" /></td>
						<td class="baslik">Soyad</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.ybSoyad}" /></td>
					</tr>
					<tr>
						<td class="baslik">Kimlik No</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.ybKimlikNo}" /></td>
						<td class="baslik">Doğum Tarihi</td>
                                                <td class="deger"><h:outputText value="#{bilesikKutukBean.bilesikKutukBilgisi.ybDogumTarih}" /></td>
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