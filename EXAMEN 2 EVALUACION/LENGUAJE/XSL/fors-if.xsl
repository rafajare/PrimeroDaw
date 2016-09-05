<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>

<table border="4">
	<tr>
    	<th>Apellidos</th>
        <th>Nombre</th>
        <th>Clasifiación</th>
    </tr>
    	 
		 
    	<xsl:for-each select="clase/alumnos/alumno">
    <tr>
    	<td><xsl:value-of select="apellido"/></td>
        <td><xsl:value-of select="nombre"/></td>
        <td><!--<xsl:if test="@nota>=5">Aprobado</xsl:if>-->
        <xsl:choose>
        <xsl:when test="@nota=5"> Aprobado </xsl:when>
        <xsl:when test="@nota=6"> Bien </xsl:when>
        <xsl:when test="@nota&lt;5"> Suspendido </xsl:when>
        
        </xsl:choose>
        
        </td>
    </tr>
    </xsl:for-each>
</table>

</body>
</html>
</xsl:template>
</xsl:stylesheet>