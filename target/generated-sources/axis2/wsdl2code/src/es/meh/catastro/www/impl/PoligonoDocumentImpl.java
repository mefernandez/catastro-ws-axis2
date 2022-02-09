/*
 * An XML document type.
 * Localname: Poligono
 * Namespace: http://www.catastro.meh.es/
 * Java type: es.meh.catastro.www.PoligonoDocument
 *
 * Automatically generated - do not modify.
 */
package es.meh.catastro.www.impl;
/**
 * A document containing one Poligono(@http://www.catastro.meh.es/) element.
 *
 * This is a complex type.
 */
public class PoligonoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements es.meh.catastro.www.PoligonoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PoligonoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLIGONO$0 = 
        new javax.xml.namespace.QName("http://www.catastro.meh.es/", "Poligono");
    
    
    /**
     * Gets the "Poligono" element
     */
    public java.lang.String getPoligono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLIGONO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Poligono" element
     */
    public org.apache.xmlbeans.XmlString xgetPoligono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLIGONO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Poligono" element
     */
    public void setPoligono(java.lang.String poligono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLIGONO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLIGONO$0);
            }
            target.setStringValue(poligono);
        }
    }
    
    /**
     * Sets (as xml) the "Poligono" element
     */
    public void xsetPoligono(org.apache.xmlbeans.XmlString poligono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLIGONO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLIGONO$0);
            }
            target.set(poligono);
        }
    }
}
