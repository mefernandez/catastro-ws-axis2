/*
 * An XML document type.
 * Localname: Callejero
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.CallejeroDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Callejero(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class CallejeroDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.CallejeroDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallejeroDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLEJERO$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Callejero");
    
    
    /**
     * Gets the "Callejero" element
     */
    public es.meh.catastro.www.CallejeroDocument.Callejero getCallejero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.CallejeroDocument.Callejero target = null;
            target = (es.meh.catastro.www.CallejeroDocument.Callejero)get_store().find_element_user(CALLEJERO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Callejero" element
     */
    public void setCallejero(es.meh.catastro.www.CallejeroDocument.Callejero callejero)
    {
        generatedSetterHelperImpl(callejero, CALLEJERO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Callejero" element
     */
    public es.meh.catastro.www.CallejeroDocument.Callejero addNewCallejero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            es.meh.catastro.www.CallejeroDocument.Callejero target = null;
            target = (es.meh.catastro.www.CallejeroDocument.Callejero)get_store().add_element_user(CALLEJERO$0);
            return target;
        }
    }
    /**
     * An XML Callejero(@http://www.catastro.meh.es/).
     *
     * This is a complex type.
     */
    public static class CallejeroImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.CallejeroDocument.Callejero
    {
        private static final long serialVersionUID = 1L;
        
        public CallejeroImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
