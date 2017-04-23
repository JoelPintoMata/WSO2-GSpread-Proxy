

/**
 * GSpread_Proxy_YenloTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */
    package org.wso2.ws.dataservice;

    /*
     *  GSpread_Proxy_YenloTest Junit test case
    */

    public class GSpread_Proxy_YenloTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testupdateProductStock() throws java.lang.Exception{

          org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
          new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.UpdateProductStock updateProductStock99=
                  (org.wso2.ws.dataservice.UpdateProductStock)getTestObject(org.wso2.ws.dataservice.UpdateProductStock.class);
                      // TODO : Fill in the updateProductStock99 here
                  

                  //There is no output to be tested!
                  stub.updateProductStock(
                  getID(updateProductStock99)
                                      ,getSTOCK(updateProductStock99)
                                      );

              
          }
      
        /**
         * Auto generated test method
         */
        public  void test_getproducts() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice._getproducts _getproducts102=
                                                        (org.wso2.ws.dataservice._getproducts)getTestObject(org.wso2.ws.dataservice._getproducts.class);
                    // TODO : Fill in the _getproducts102 here
                
                        assertNotNull(stub._getproducts(
                        _getproducts102));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStart_getproducts() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice._getproducts _getproducts102=
                                                        (org.wso2.ws.dataservice._getproducts)getTestObject(org.wso2.ws.dataservice._getproducts.class);
                    // TODO : Fill in the _getproducts102 here
                

                stub.start_getproducts(
                         _getproducts102,
                    new tempCallbackN65601()
                );
              


        }

        private class tempCallbackN65601  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN65601(){ super(null);}

            public void receiveResult_getproducts(
                         org.wso2.ws.dataservice.Product[] result
                            ) {
                
            }

            public void receiveError_getproducts(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testabort_boxcar() throws java.lang.Exception{

          org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
          new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.Abort_boxcar abort_boxcar105=
                  (org.wso2.ws.dataservice.Abort_boxcar)getTestObject(org.wso2.ws.dataservice.Abort_boxcar.class);
                      // TODO : Fill in the abort_boxcar105 here
                  

                  //There is no output to be tested!
                  stub.abort_boxcar(
                  abort_boxcar105);

              
          }
      
        /**
         * Auto generated test method
         */
        public  void test_getproductsbyname() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice._getproductsbyname _getproductsbyname106=
                                                        (org.wso2.ws.dataservice._getproductsbyname)getTestObject(org.wso2.ws.dataservice._getproductsbyname.class);
                    // TODO : Fill in the _getproductsbyname106 here
                
                        assertNotNull(stub._getproductsbyname(
                        getNAME(_getproductsbyname106)
                                      ));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStart_getproductsbyname() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice._getproductsbyname _getproductsbyname106=
                                                        (org.wso2.ws.dataservice._getproductsbyname)getTestObject(org.wso2.ws.dataservice._getproductsbyname.class);
                    // TODO : Fill in the _getproductsbyname106 here
                

                stub.start_getproductsbyname(
                         getNAME(_getproductsbyname106)
                                      ,
                    new tempCallbackN65705()
                );
              


        }

        private class tempCallbackN65705  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN65705(){ super(null);}

            public void receiveResult_getproductsbyname(
                         org.wso2.ws.dataservice.Product[] result
                            ) {
                
            }

            public void receiveError_getproductsbyname(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testproducts() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice.Products2 products2110=
                                                        (org.wso2.ws.dataservice.Products2)getTestObject(org.wso2.ws.dataservice.Products2.class);
                    // TODO : Fill in the products2110 here
                
                        assertNotNull(stub.products(
                        products2110));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartproducts() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice.Products2 products2110=
                                                        (org.wso2.ws.dataservice.Products2)getTestObject(org.wso2.ws.dataservice.Products2.class);
                    // TODO : Fill in the products2110 here
                

                stub.startproducts(
                         products2110,
                    new tempCallbackN65792()
                );
              


        }

        private class tempCallbackN65792  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN65792(){ super(null);}

            public void receiveResultproducts(
                         org.wso2.ws.dataservice.Product[] result
                            ) {
                
            }

            public void receiveErrorproducts(java.lang.Exception e) {
                fail();
            }

        }
      
          /**
          * Auto generated test method
          */
          public  void testaddProduct() throws java.lang.Exception{

          org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
          new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint
          org.wso2.ws.dataservice.AddProduct addProduct113=
                  (org.wso2.ws.dataservice.AddProduct)getTestObject(org.wso2.ws.dataservice.AddProduct.class);
                      // TODO : Fill in the addProduct113 here
                  

                  //There is no output to be tested!
                  stub.addProduct(
                  getID(addProduct113)
                                      ,getNAME(addProduct113)
                                      ,getDESCRIPTION(addProduct113)
                                      ,getSTOCK(addProduct113)
                                      );

              
          }
      
        /**
         * Auto generated test method
         */
        public  void testproductsByName() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice.ProductsByName productsByName118=
                                                        (org.wso2.ws.dataservice.ProductsByName)getTestObject(org.wso2.ws.dataservice.ProductsByName.class);
                    // TODO : Fill in the productsByName118 here
                
                        assertNotNull(stub.productsByName(
                        getNAME(productsByName118)
                                      ));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartproductsByName() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice.ProductsByName productsByName118=
                                                        (org.wso2.ws.dataservice.ProductsByName)getTestObject(org.wso2.ws.dataservice.ProductsByName.class);
                    // TODO : Fill in the productsByName118 here
                

                stub.startproductsByName(
                         getNAME(productsByName118)
                                      ,
                    new tempCallbackN65944()
                );
              


        }

        private class tempCallbackN65944  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN65944(){ super(null);}

            public void receiveResultproductsByName(
                         org.wso2.ws.dataservice.Product[] result
                            ) {
                
            }

            public void receiveErrorproductsByName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testend_boxcar() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice.End_boxcar end_boxcar122=
                                                        (org.wso2.ws.dataservice.End_boxcar)getTestObject(org.wso2.ws.dataservice.End_boxcar.class);
                    // TODO : Fill in the end_boxcar122 here
                
                        assertNotNull(stub.end_boxcar(
                        end_boxcar122));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartend_boxcar() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice.End_boxcar end_boxcar122=
                                                        (org.wso2.ws.dataservice.End_boxcar)getTestObject(org.wso2.ws.dataservice.End_boxcar.class);
                    // TODO : Fill in the end_boxcar122 here
                

                stub.startend_boxcar(
                         end_boxcar122,
                    new tempCallbackN66031()
                );
              


        }

        private class tempCallbackN66031  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN66031(){ super(null);}

            public void receiveResultend_boxcar(
                         org.apache.axiom.om.OMElement result
                            ) {
                
            }

            public void receiveErrorend_boxcar(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testbegin_boxcar() throws java.lang.Exception{

        org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub =
                    new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();//the default implementation should point to the right endpoint

           org.wso2.ws.dataservice.Begin_boxcar begin_boxcar125=
                                                        (org.wso2.ws.dataservice.Begin_boxcar)getTestObject(org.wso2.ws.dataservice.Begin_boxcar.class);
                    // TODO : Fill in the begin_boxcar125 here
                
                        assertNotNull(stub.begin_boxcar(
                        begin_boxcar125));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartbegin_boxcar() throws java.lang.Exception{
            org.wso2.ws.dataservice.GSpread_Proxy_YenloStub stub = new org.wso2.ws.dataservice.GSpread_Proxy_YenloStub();
             org.wso2.ws.dataservice.Begin_boxcar begin_boxcar125=
                                                        (org.wso2.ws.dataservice.Begin_boxcar)getTestObject(org.wso2.ws.dataservice.Begin_boxcar.class);
                    // TODO : Fill in the begin_boxcar125 here
                

                stub.startbegin_boxcar(
                         begin_boxcar125,
                    new tempCallbackN66106()
                );
              


        }

        private class tempCallbackN66106  extends org.wso2.ws.dataservice.GSpread_Proxy_YenloCallbackHandler{
            public tempCallbackN66106(){ super(null);}

            public void receiveResultbegin_boxcar(
                         org.apache.axiom.om.OMElement result
                            ) {
                
            }

            public void receiveErrorbegin_boxcar(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

                            private int getID(
                            org.wso2.ws.dataservice.UpdateProductStock wrappedType){
                            
                                    return wrappedType.getID();
                                
                            }

                         

                            private int getSTOCK(
                            org.wso2.ws.dataservice.UpdateProductStock wrappedType){
                            
                                    return wrappedType.getSTOCK();
                                
                            }

                         

                            private java.lang.String getNAME(
                            org.wso2.ws.dataservice._getproductsbyname wrappedType){
                            
                                    return wrappedType.getNAME();
                                
                            }

                         

                            private int getID(
                            org.wso2.ws.dataservice.AddProduct wrappedType){
                            
                                    return wrappedType.getID();
                                
                            }

                         

                            private java.lang.String getNAME(
                            org.wso2.ws.dataservice.AddProduct wrappedType){
                            
                                    return wrappedType.getNAME();
                                
                            }

                         

                            private java.lang.String getDESCRIPTION(
                            org.wso2.ws.dataservice.AddProduct wrappedType){
                            
                                    return wrappedType.getDESCRIPTION();
                                
                            }

                         

                            private int getSTOCK(
                            org.wso2.ws.dataservice.AddProduct wrappedType){
                            
                                    return wrappedType.getSTOCK();
                                
                            }

                         

                            private java.lang.String getNAME(
                            org.wso2.ws.dataservice.ProductsByName wrappedType){
                            
                                    return wrappedType.getNAME();
                                
                            }

                         

    }
    