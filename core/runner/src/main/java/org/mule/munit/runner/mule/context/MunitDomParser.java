package org.mule.munit.runner.mule.context;

import org.mule.munit.common.MunitCore;

import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XNIException;


public class MunitDomParser extends DOMParser
{
    public static final String NAMESPACE = "http://www.mule.org/munit";
    XMLLocator xmlLocator;
    @Override
    public void startDocument(XMLLocator locator, String encoding, NamespaceContext namespaceContext, Augmentations augs) throws XNIException
    {
        this.xmlLocator = locator;
        super.startDocument(locator, encoding, namespaceContext, augs);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void startElement(QName element, XMLAttributes attributes, Augmentations augs) throws XNIException
    {
        String location = String.valueOf(xmlLocator.getLineNumber());
        attributes.addAttribute(new QName(MunitCore.LINE_NUMBER_ELEMENT_ATTRIBUTE, null,
                                          MunitCore.LINE_NUMBER_ELEMENT_ATTRIBUTE, NAMESPACE), "CDATA", location);
        super.startElement(element, attributes, augs);
    }


}
