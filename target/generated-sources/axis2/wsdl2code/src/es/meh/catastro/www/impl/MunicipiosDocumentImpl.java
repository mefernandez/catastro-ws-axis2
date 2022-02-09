/*
 * An XML document type.
 * Localname: Municipios
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.MunicipiosDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Municipios(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class MunicipiosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.MunicipiosDocument
{
    private static final long serialVersionUID = 1L;
    
    public MunicipiosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUNICIPIOS$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Municipios");
    
    
    /**
     * Gets the "Municipios" element
     */
    public es.meh.catastro.www.MunicipiosDocument.Municipios getMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.MunicipiosDocument.Municipios target = null;
            target = (es.meh.catastro.www.MunicipiosDocument.Municipios)get_store().find_element_user(MUNICIPIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Municipios" element
     */
    public void setMunicipios(es.meh.catastro.www.MunicipiosDocument.Municipios municipios)
    {
        generatedSetterHelperImpl(municipios, MUNICIPIOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Municipios" element
     */
    public es.meh.catastro.www.MunicipiosDocument.Municipios addNewMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.MunicipiosDocument.Municipios target = null;
            target = (es.meh.catastro.www.MunicipiosDocument.Municipios)get_store().add_element_user(MUNICIPIOS$0);
            return target;
        }
    }
    /**
     * An XML Municipios(@http://www.catastro.meh.es/).
     *
     * This is a complex type.
     */
    public static class MunicipiosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.MunicipiosDocument.Municipios
    {
        private static final long serialVersionUID = 1L;
        
        public MunicipiosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
