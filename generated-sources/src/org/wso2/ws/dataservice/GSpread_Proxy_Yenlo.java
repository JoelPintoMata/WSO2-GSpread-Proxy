

/**
 * GSpread_Proxy_Yenlo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.ws.dataservice;

    /*
     *  GSpread_Proxy_Yenlo java interface
     */

    public interface GSpread_Proxy_Yenlo {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  updateProductStock(
         int iD13,int sTOCK14

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param _getproducts15
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Product[] _getproducts(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getproducts15
            
          */
        public void start_getproducts(

            

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Control operation for aborting a boxcarring session
         */
        public void  abort_boxcar(
         

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param _getproductsbyname19
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Product[] _getproductsbyname(

                        java.lang.String nAME20)
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param _getproductsbyname19
            
          */
        public void start_getproductsbyname(

            java.lang.String nAME20,

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param products223
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Product[] products(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param products223
            
          */
        public void startproducts(

            

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addProduct(
         int iD27,java.lang.String nAME28,java.lang.String dESCRIPTION29,int sTOCK30

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * 
                    * @param productsByName31
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.wso2.ws.dataservice.Product[] productsByName(

                        java.lang.String nAME32)
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param productsByName31
            
          */
        public void startproductsByName(

            java.lang.String nAME32,

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Control operation for ending a boxcarring session
                    * @param end_boxcar35
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.apache.axiom.om.OMElement end_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for ending a boxcarring session
                * @param end_boxcar35
            
          */
        public void startend_boxcar(

            

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Control operation for beginning a boxcarring session
                    * @param begin_boxcar38
                
             * @throws org.wso2.ws.dataservice.DataServiceFaultException : 
         */

         
                     public org.apache.axiom.om.OMElement begin_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.ws.dataservice.DataServiceFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for beginning a boxcarring session
                * @param begin_boxcar38
            
          */
        public void startbegin_boxcar(

            

            final org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    