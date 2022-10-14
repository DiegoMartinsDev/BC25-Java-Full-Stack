/**
 * métodos de recuperação de e elementos HTML
 */

/*recupera elementos HTML a partir do nome da tag
const todoForm = document.getElementsByTagName('form')*/

const todoForm = document.getElementById("todo-form")
const todos = []

//addEventListener server para ouvir eventos de elementos
todoForm.addEventListener('submit', function (evento) {
    evento.preventDefault();
    evento.stopPropagation();
    const todoInput = document.querySelector("#todo");
    todos.push(todoInput.value);
    todoInput.value = "";
    
})

function renderizarTodos(){
    const todosListSection = document.querrySelector('#todos-list')
    for (let tarefa of todos){
      const divCard = document.createElement('div')
      divCard.classList.add('card','bg-warning')
      
      const divCardBody = document.createElement('div')
      divCardBody.classList.add('card-body', "d-flex","align-items-center")
      const pTodoText = document.createElement('p')
      pTodoText.classList.add('todo-text', 'flex-grow-1', 'text-truncate')
      pTodoText.innerText = tarefa

      const btnDelete = document.createElement('button')
      btnDelete.classList.add('btn','delete-todo')
      btnDelete.addEventList('click', () => {
        const index = todos.indexOf(tarefa)
      })

      const spanIcon = document.createElement('span')
      spanIcon.classList.add('material-symbol-outlined')
      spanIcon.innerText = 'delete'

      btnDelete.appendChild(spanIcon)
        divCardBody.append(pTodoText, btnDelete)
        divCard.appendChild(divCardBody)
        todosListSection.appendChild(divCard)
    }
}