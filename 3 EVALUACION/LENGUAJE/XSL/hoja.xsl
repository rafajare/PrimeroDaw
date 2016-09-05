<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:template match="/">
  
    <html>
    <body>
    <h1> Listado de alumnos </h1>
    
    <table border="4">
    <tr>
    <th> Apellidos </th>
    <th> Nombre	</th>
    </tr>
    <xsl:for-each select="clase/alumnos/alumno[starts-with(nombre,'D')]">
    <xsl:sort select="nombre"/>
    <tr>
    <td> <xsl:value-of select="nombre"/> </td>
    <td> <xsl:value-of select="apellido"/></td>
    </tr>
    </xsl:for-each>
    
   
    
    
    </table>
    
    <h1> Listado de alumnos </h1>
    <table border="4">
    <tr>
    <th> Apellidos </th>
    <th> Nombre	</th>
    </tr>
    
    <xsl:for-each select="clase/profesores/profesor[apellido='Alberola']">
    <tr>
    <td>  <xsl:value-of select="nombre"/> </td>
    <td>  <xsl:value-of select="apellido"/> </td>
    </tr>
    </xsl:for-each> 
    </table>
    
    </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
