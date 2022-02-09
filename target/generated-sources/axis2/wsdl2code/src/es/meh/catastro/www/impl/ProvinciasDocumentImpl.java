/*
 * An XML document type.
 * Localname: Provincias
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.ProvinciasDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Provincias(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class ProvinciasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ProvinciasDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvinciasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVINCIAS$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Provincias");
    
    
    /**
     * Gets the "Provincias" element
     */
    public es.meh.catastro.www.ProvinciasDocument.Provincias getProvincias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ProvinciasDocument.Provincias target = null;
            target = (es.meh.catastro.www.ProvinciasDocument.Provincias)get_store().find_element_user(PROVINCIAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Provincias" element
     */
    public void setProvincias(es.meh.catastro.www.ProvinciasDocument.Provincias provincias)
    {
        generatedSetterHelperImpl(provincias, PROVINCIAS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Provincias" element
     */
    public es.meh.catastro.www.ProvinciasDocument.Provincias addNewProvincias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.ProvinciasDocument.Provincias target = null;
            target = (es.meh.catastro.www.ProvinciasDocument.Provincias)get_store().add_element_user(PROVINCIAS$0);
            return target;
        }
    }
    /**
     * An XML Provincias(@http://www.catastro.meh.es/).
     *
     * This is a complex type.
     */
    public static class ProvinciasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.ProvinciasDocument.Provincias
    {
        private static final long serialVersionUID = 1L;
        
        public ProvinciasImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
