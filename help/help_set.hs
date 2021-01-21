<helpset version="1.0">
    <title>Ayuda de la aplicacion "Best calculator"</title>
    <maps>
        <!--Pagina por defecto-->
        <homeID>menu</homeID>
        <!--Mapa deseado-->
        <mapref location="map_file.jhm"/>
    </maps>

    <!--Vistas a mostrar en la ayuda-->
    <!--Tabla de contenidos-->
    <view>
        <name>Tabla Contenidos</name>
        <label>Tabla de contenidos</label>
        <type>javax.help.TOCView</type>
        <data>toc.xml</data>
    </view>

    <!--El indice-->
    <view>
        <name>Indice</name>
        <label>El indice</label>
        <type>javax.help.IndexView</type>
        <data>indice.xml</data>
    </view>

    <!--La pestaña de busqueda-->
    <view>
        <name>Buscar</name>
        <label>Buscar</label>
        <type>javax.help.SearchView</type>
        <data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
    </view>
</helpset>
