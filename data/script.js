'use strict'

fetch('https://raw.githubusercontent.com/Bodrbli/Collections/main/data/index.json')
      .then(response => response.json())
      .then(json => json.forEach(render))

      function render(value) {


            const bodyRow = document.querySelector('tbody');
            const t = document.querySelector('#element-row');


            const columnType = t.content.querySelector('#type');
                  columnType.textContent = value.ListName;
            const columnCount = t.content.querySelector('#count');
                  columnCount.textContent = value.Num;
            const columnFillCollection = t.content.querySelector('#fillCollection');
                  columnFillCollection.textContent = value.FillCollection;
            const columnFirst5Percent = t.content.querySelector('#first5Percent');
                  columnFirst5Percent.textContent = value.First5Percent;
            const columnLast5Percent = t.content.querySelector('#last5Percent');
                  columnLast5Percent.textContent = value.Last5Percent;
            const columnRemoveFirst = t.content.querySelector('#removeFirst');
                  columnRemoveFirst.textContent = value.RemoveFirst;
            const columnRemoveLast = t.content.querySelector('#removeLast');
                  columnRemoveLast.textContent = value.RemoveLast;
            const columnSetName = t.content.querySelector('#setName');
                  columnSetName.textContent = value.SetName;
            const columnRemoveName = t.content.querySelector('#removeName');
                  columnRemoveName.textContent = value.RemoveName;

            bodyRow.append(t.content.cloneNode(true));
      }