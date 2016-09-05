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
    	 <!-- For para aprobados !-->
    	<xsl:for-each select="clase/alumnos/alumno[@nota>='5']">
    <tr>
    	<td><xsl:value-of select="apellido"/></td>
        <td><xsl:value-of select="nombre"/></td>
        <td>Aprobado</td>
    </tr>
    </xsl:for-each>
    <!-- For para suspendidos !-->
    <xsl:for-each select="clase/alumnos/alumno[@nota&lt;'5']">
    <tr>
    	<td><xsl:value-of select="apellido"/></td>
        <td><xsl:value-of select="nombre"/></td>
        <td>Suspendido</td>
    </tr>
    </xsl:for-each>

</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>