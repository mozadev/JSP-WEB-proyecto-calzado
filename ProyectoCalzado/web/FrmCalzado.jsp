<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tienda Calzado</title>

    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div>
        <div class="contenedor">
            <form action="CalzadoControlador" method="POST">
                <div>
                    <label>Marca: </label>
                    <div>
                        <select name="cbmarca" style="width:250px">
                            <option selected="true" disabled="disabled">seleccione la marca</option>
                            <option value="Batta">Batta</option>
                            <option value="Calimod">Calimod</option>
                            <option value="Azaleia">Azaleia</option>
                            <option value="Renzo Costa">Renzo Costa</option>
                        </select>
                    </div>
                </div>
                <div>
                    <label> Talla:</label>
                    <div>
                        <select name="cbtalla" style="width:250px">
                            <option selected="true" disabled="disabled">seleccione la talla</option>
                            <option value="30">30</option>
                            <option value="35">35</option>
                            <option value="39">39</option>
                            <option value="40">40</option>
                            <option value="44">44</option>
                        </select>
                    </div>
                </div>
                <div>
                    <label>Numero de Pares Vendidos</label>
                    <div class="">
                        <input type="txt" name="txtpares" style="width:134px;">
                    </div>
                    <br>
                </div>
                <div class="botones">
                    <input type="submit" name="calcular" value="calculardatos" style="width:150px">
                </div>
                <br><br>
                <textarea disabled style="width:340px;height:220px;" rows="10"
                    cols="30"> <%=request.getAttribute("resultado_calzado")%></textarea>
            </form>
        </div>
    </div>
</body>

</html>