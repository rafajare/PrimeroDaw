<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
</html>
<body>

<h1> LLMM </h1>

<table border="4">
	<tr>  
        <th>Apellido</th> 
        <th>Nota</th> 
    </tr>
    <xsl:for-each select="departamento/alumnos/alumno/creditos/credito[nombre='Lenguajes de marcas']">   
    <tr> 
    	<td> <xsl:value-of select="../../nombre"> </xsl:value-of> </td>
        <td> <xsl:value-of select="nota"> </xsl:value-of></td>
    </tr>
    </xsl:for-each>
</table>
<br /> <br />
<table border="4">
	<tr> 
    	<th> Apellidos </th>
        <th> Nota Media </th>
        
    </tr>
    	<xsl:for-each select="departamento/alumnos/alumno">  
    <tr>
    	<td> <xsl:value-of select="apellido"> </xsl:value-of></td>
        <td> <xsl:value-of select='sum(creditos/credito/nota) div count(creditos/credito/nota)'> </xsl:value-of></td>
    </tr>
    </xsl:for-each>
</table>
<br /> <br />

<table>
	<tr>
    	<th bgcolor="#CCFF66"> APROBADOS</th>
    </tr>
    <xsl:for-each select="departamento/alumnos/alumno/creditos/credito[nombre='Lenguajes de marcas'][nota>=5]"> 
    <tr>
    <td><xsl:value-of select="../../nombre"> </xsl:value-of></td>
    <td>    
        <xsl:choose>
        <xsl:when test="nota=5"> Suficiente </xsl:when>
        <xsl:when test="nota=6"> Bien </xsl:when>
        <xsl:when test="nota=7"> Notable </xsl:when>
        <xsl:when test="nota=8"> Notable </xsl:when>
        <xsl:when test="nota=9"> Sobresaliente</xsl:when>
        <xsl:when test="nota=10">Sobresaliente</xsl:when>
    	</xsl:choose>
    </td>   
    </tr>
	</xsl:for-each>
</table>
</body>
</xsl:template>
</xsl:stylesheet>