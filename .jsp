jsp file


<aui:script>
  Liferay.Service(
    '/group/get-groups',
    {
      companyId: 20095,
      parentGroupId: 37720,
      site: false,
      start: -1,
      end: -1
    },
    function(obj) {
      alert(obj);      
      //console.log(obj);
    }
  );
</aui:script>






