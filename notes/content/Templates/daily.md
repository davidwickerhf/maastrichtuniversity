---
tags: journal/daily
wakeup: 
pills:
lotion: 
reading: 
shower:
sleep:
linen: 
gym: 
nofap: 
nosmoke: 
---

>[!NOTE] Month
>Related month note → <% "[" + "[" + tp.file.title.slice(0, 7) + "]]" %>

# uncompleted tasks
```dataview
TASK
WHERE contains(file.name, "<% tp.user.returnPreviousDayString( tp.file.title ) %>") AND !contains(tags, "#habit")
GROUP BY file.name
```

# planned for today


# diary


# focus
```toggl
SUMMARY FROM <% tp.file.title %> TO <% tp.file.title %>
EXCLUDE PROJECTS "Relax"
```

# notes taken today
```dataview
LIST
WHERE file.cday = date("<% tp.file.title %>") AND !contains(file.name, "2023")
```

# notes edited today
```dataview
LIST
WHERE file.mday = date("<% tp.file.title %>")  AND !contains(file.name, "<% tp.file.title.slice(0, 7) %>")
```