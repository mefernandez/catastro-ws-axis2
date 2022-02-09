/*
 * An XML document type.
 * Localname: Planta
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.PlantaDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Planta(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class PlantaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.PlantaDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlantaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANTA$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Planta");
    
    
    /**
     * Gets the "Planta" element
     */
    public java.lang.String getPlanta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Planta" element
     */
    public org.apache.xmlbeans.XmlString xgetPlanta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLANTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Planta" element
     */
    public void setPlanta(java.lang.String planta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANTA$0);
            }
            target.setStringValue(planta);
        }
    }
    
    /**
     * Sets (as xml) the "Planta" element
     */
    public void xsetPlanta(org.apache.xmlbeans.XmlString planta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLANTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLANTA$0);
            }
            target.set(planta);
        }
    }
}
