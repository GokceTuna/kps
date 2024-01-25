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
	<h2 style="text-align: center;">Kimlik Numarası ile Bileşik Kütük Sorgulama</h2>
	<f:view>
		<h:form id="form">
			<div style="text-align: center">
				<h:messages showDetail="true" showSummary="true" errorStyle="color: red; font-weight: normal" fatalStyle="color: red; font-weight: bold"></h:messages>
			</div>
			<table style="width: 30%">
				<tr>
					<td colspan="2" class="anabaslik">Kriterler</td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
					<td class="baslik">Kimlik No</td>
					<td class="deger">
						<h:inputText value="#{bilesikKutukBean.tcKimlikNo}"></h:inputText>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
                                        <h:commandButton value="Sorgula" action="#{bilesikKutukBean.sorgula}"></h:commandButton>
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