<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_if (window.top  window.self)</name>
   <tag></tag>
   <elementGuidId>61172387-e1cd-44e6-bf8c-56ace2bd5ca6</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*[@lang = 'en']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>[lang=&quot;en&quot;]</value>
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
      <webElementGuid>b55a283b-5e96-4c54-874c-abe7e39b8163</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
      <webElementGuid>d84399d3-d619-4f3c-a4b6-94e16677e3c0</webElementGuid>
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
      <webElementGuid>cbaadc9e-8df7-4305-97f7-66e00985aede</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-cbb33e1b714e298e30398b7f6cbbad65</value>
      <webElementGuid>8d02f0f3-53c0-4a84-a14f-360034b8bdc5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>0e99f87f-9ddd-4341-aea7-80b43376ffad</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>6e26ea60-00dc-4386-97a3-f61b46fe8bee</webElementGuid>
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
      <webElementGuid>a565b0ba-4b85-4d26-9743-cc27dfe6736c</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
