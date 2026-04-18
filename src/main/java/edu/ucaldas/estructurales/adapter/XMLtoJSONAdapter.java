package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJSON() {
        // Obtenemos los datos en XML desde el servicio
        String xmlData = xmlService.getXML();

        // Simulamos la conversión a JSON
        return "{ \"data\": \"" + xmlData + "\" }";
    }
}
