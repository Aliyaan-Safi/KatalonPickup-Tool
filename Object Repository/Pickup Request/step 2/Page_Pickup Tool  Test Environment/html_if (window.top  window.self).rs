<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_if (window.top  window.self)</name>
   <tag></tag>
   <elementGuidId>8be38214-69b5-492c-9f4f-e5fcf1d563db</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>[lang=&quot;en&quot;]</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//*[@lang = 'en']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
      <webElementGuid>cfa9b6b7-5350-4033-849f-41bf40530864</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
      <webElementGuid>bf5370dd-6678-424e-8f7f-368da2bea04a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

</value>
      <webElementGuid>95178c16-7388-4dfe-85d9-532e6be92226</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-cbb33e1b714e298e30398b7f6cbbad65</value>
      <webElementGuid>0eeec8c6-b6fc-44ef-9d31-0b9ecd6780a6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>179b0a13-afbf-4977-abdb-fcb67e91903f</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>58be4701-c6c1-4853-bd70-b3738a02f4a7</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//html[(text() = '
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

' or . = '
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

')]</value>
      <webElementGuid>99ffc2a0-e9c1-4bac-9171-8243e8560b51</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
