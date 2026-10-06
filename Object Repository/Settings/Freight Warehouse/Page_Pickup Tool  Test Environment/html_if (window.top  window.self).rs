<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_if (window.top  window.self)</name>
   <tag></tag>
   <elementGuidId>28c9a436-fb9f-4f68-9b7f-e28f23aa90af</elementGuidId>
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
      <webElementGuid>965aeaab-5d2c-47b1-b5fa-551c9623f5d6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
      <webElementGuid>ea520c58-283d-49bd-910f-a5aeaa2da93d</webElementGuid>
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
      <webElementGuid>79597d3b-947b-4c3f-8d7b-726c52ed54fa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-cbb33e1b714e298e30398b7f6cbbad65</value>
      <webElementGuid>543ebfb2-7804-412e-86b8-290a88186821</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>2e8f920e-e72b-4508-a07b-a5c4ad976568</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>cf05f937-1440-4547-a1da-44a54fbbf09c</webElementGuid>
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
      <webElementGuid>000227b8-21bf-4e5e-9e56-96959b99f1c7</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
