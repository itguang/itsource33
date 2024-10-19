import axios from 'axios'
import store from '@/store'
import { Message } from 'element-ui'

// 创建实例
const instance = axios.create({
  baseURL: 'http://localhost:9090',
  timeout: 5000
})

// request 拦截器,添加token
instance.interceptors.request.use(
    config => {
      config.headers.authorization = 'bearer ' + store.state.tokenData.access_token
      return config
    },
    err => {
      return Promise.reject(err)
    })

// response 拦截器
instance.interceptors.response.use(
    response => {
      return response
    },
    error => {
      if (error.response.status === 400 || error.response.status === 401 || error.response.status === 403) {
        console.log(11)
        Message({
          showClose: true,
          message: error.response.data.message,
          type: 'error'
        })
      } else {
        Message({
          showClose: true,
          message: error,
          type: 'error'
        })
      }
      return Promise.reject(error)
    })

// 通用方法
export function userRequest (config) {
  return new Promise((resolve, reject) => {
    instance(config)
      .then(res => {
        resolve(res)
      }).catch(err => {
        reject(err)
      })
  })
}

// 封装 get 方法
export function get (url,params) {
    return new Promise((resolve, reject) => {
        instance.get(url, {params})
            .then(res => {
                resolve(res)
            }).catch(err => {
            reject(err)
        })
    })
}

// 封装 post 方法
export function post (url,body) {
  return new Promise((resolve, reject) => {
    instance.post(url, body)
        .then(res => {
          resolve(res)
        }).catch(err => {
      reject(err)
    })
  })
}

// 封装常用的HTTP方法

// 把 下面方法export 出去
// const get = (url, params = {}) => instance.get(url, { params });
// const post = (url, data = {}) => instance.post(url, data);
// const put = (url, data = {}) => instance.put(url, data);
// const del = (url, params = {}) => instance.delete(url, { params });
//
// export default {
//   get,
//   post,
//   put,
//   del
// };
