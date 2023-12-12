'use strict'

 fetch('https://raw.githubusercontent.com/Bodrbli/Collections/main/data/index.json')
      .then(response => response.json())
      .then(json => json.forEach(render))

      function render(value) {
                  const bodyRow = document.querySelector('tbody');
                  const t = document.querySelector('#element-row');
                  bodyRow.append(t.content.cloneNode(true));

                  const columnFillCollecrion = t.content.querySelector('#fillCollection');
                        columnFillCollecrion.textContent = values[j],[0];
                  const columnFirst5Percent = t.content.querySelector('#first5Percent');
                        columnFirst5Percent.textContent = values[j],[1];
                  const columnLast5Percent = t.content.querySelector('#last5Percent');
                        columnLast5Percent.textContent = values[j],[2];
                  const columnRemoveFirst = t.content.querySelector('#removeFirst');
                        columnRemoveFirst.textContent = values[j],[3];
                  const columnRemoveLast = t.content.querySelector('#removeLast');
                        columnRemoveLast.textContent = values[j],[4];
                  const columnSetName = t.content.querySelector('#setName');
                        columnSetName.textContent = values[j],[5];
                  const columnRemoveName = t.content.querySelector('#removeName');
                        columnRemoveName.textContent = values[j],[6];
            }
      }
      showTable();