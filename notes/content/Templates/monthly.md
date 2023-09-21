## ✏️ uncompleted tasks
```dataview
TASK
FROM "Agenda/Daily"
WHERE !completed AND file.day.month = date("lecture-01").month AND !contains(tags, "#habit") AND !rescheduled
GROUP BY file.name
```


## ⏳ focus time
```toggl
SUMMARY FROM lecture-01 TO TODAY
```

## ✅ habit tracker
```dataviewjs
dv.span("**⛔️ No Fap**")

const calendarData = {
    year: 2023,
    colors: {    // (optional) defaults to green
        blue:        ["#8cb9ff", "#69a3ff", "#428bff", "#1872ff", "#0058e2"], // first entry is considered default if supplied
        green:       ["#c6e48b", "#7bc96f", "#49af5d", "#2e8840", "#196127"],
        red:         ["#ff9e82", "#ff7b55", "#ff4d1a", "#e73400", "#bd2a00"],
        orange:      ["#ffa244", "#fd7f00", "#dd6f00", "#bf6000", "#9b4e00"],
        pink:        ["#ff96cb", "#ff70b8", "#ff3a9d", "#ee0077", "#c30062"],
        orangeToRed: ["#ffdf04", "#ffbe04", "#ff9a03", "#ff6d02", "#ff2c01"]
    },
    entries: [],
    intensityScaleStart: 1,
    intensityScaleEnd: 4,
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>!p.nofap)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
        color: 'green',
        intensity: 3
    })
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.nofap)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
        color: 'red',
        intensity: p.nofap
    })
}

renderHeatmapCalendar(this.container, calendarData)
```

```dataviewjs
dv.span("**💊 Pills**")

const calendarData = {
    year: 2023,
    entries: [],
    showCurrentDayBorder: true
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.pills)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
    })
       
}

renderHeatmapCalendar(this.container, calendarData)
```

```dataviewjs
dv.span("**💇 Hair Lotion**")

const calendarData = {
    year: 2023,
    entries: []
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.lotion)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
    })
       
}

renderHeatmapCalendar(this.container, calendarData)
```

```dataviewjs
dv.span("**📚 Reading**")

const calendarData = {
    year: 2023,
	blue: ["#ffdf04","#ffbe04","#ff9a03","#ff6d02","#ff2c01"],
    entries: [],
    intensityScaleEnd: 45
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.reading)){
    calendarData.entries.push({
        date: page.file.name,
        intensity: page.reading,
        content: await dv.span(`[](${page.file.name})`),
    })
       
}

renderHeatmapCalendar(this.container, calendarData)
```

```dataviewjs
dv.span("**🚿 Shower**")

const calendarData = {
    year: 2023,
    entries: []
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.shower)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
    })
       
}

renderHeatmapCalendar(this.container, calendarData)
```

```dataviewjs
dv.span("**🛌 Linen Change**")

const calendarData = {
    year: 2023,
    entries: []
}

for(let page of dv.pages('"Agenda/Daily"').where(p=>p.linen)){
    calendarData.entries.push({
        date: page.file.name,
        content: await dv.span(`[](${page.file.name})`),
    })
       
}

renderHeatmapCalendar(this.container, calendarData)
```

# 📝 notes calendar
```dataview
CALENDAR file.mtime
WHERE !contains(file.name, "lecture")
```