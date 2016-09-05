<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<h1> Mi biblioteca </h1>
<table border="4">
	<tr>
    	<th bgcolor="#CC33FF"> ISBN </th>
    	<th bgcolor="#CC33FF">Título </th>
        <th bgcolor="#CC33FF"> Autor </th>
        <th bgcolor="#CC33FF"> Precio </th>
        
    </tr>
    	<xsl:for-each select="libreria/libro">
        <xsl:choose>
        <xsl:when test="precio>25"> 
        <tr>        
    	<td bgcolor="#FF0000"><xsl:value-of select="isbn"></xsl:value-of></td>
    	<td bgcolor="#FF0000"><xsl:value-of select="titulo"> </xsl:value-of></td>
        <td bgcolor="#FF0000"><xsl:value-of select="autor"> </xsl:value-of></td>
        <td bgcolor="#FF0000"><xsl:value-of select="precio"> </xsl:value-of></td>
        </tr>
        </xsl:when>
        </xsl:choose>
		</xsl:for-each>
        
        <xsl:for-each select="libreria/libro">
        <xsl:choose>
        <xsl:when test="precio&lt;25"> 
        <tr>        
    	<td bgcolor="#009900"><xsl:value-of select="isbn"></xsl:value-of></td>
    	<td bgcolor="#009900"><xsl:value-of select="titulo"> </xsl:value-of></td>
        <td bgcolor="#009900"><xsl:value-of select="autor"> </xsl:value-of></td>
        <td bgcolor="#009900"><xsl:value-of select="precio"> </xsl:value-of></td>
        </tr>
        </xsl:when>
        </xsl:choose>
		</xsl:for-each>
    	
</table>
</body>
</html>

</xsl:template>
</xsl:stylesheet>